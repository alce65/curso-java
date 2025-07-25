package local.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "meetings")
public class Meeting {
    @Column(name = "meeting_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;
    private LocalDateTime date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
    private Room room;

    @OneToOne(mappedBy = "meeting", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Record record;

    @ManyToMany(mappedBy = "meetings", fetch = FetchType.LAZY)
    private Set<Person> persons;

    public Meeting() {
        // JPA default constructor
    }

    public Meeting(String description, LocalDateTime date) {
        this.description = description;
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return toString(false);
    }

    public String toString(boolean isFull) {
        StringBuilder sb = new StringBuilder();
        sb.append("Meeting {id:").append(id)
                //
                .append(", description:").append(description)
                //
                .append(", date:").append(date.format(DateTimeFormatter.ISO_LOCAL_DATE))
                //
                .append(", time:").append(date.format(DateTimeFormatter.ISO_LOCAL_TIME));

        if (isFull && room != null) {
            sb.append(", room=:").append(room);
        }

        if (isFull && record != null) {
            sb.append(", record=:").append(record);
        }

        sb.append("}");
        return sb.toString();
    }

}
