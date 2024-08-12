package yg.booking_ticket.entity

import jakarta.persistence.*

@Entity
@Table(name = "users")
class User(
    val loginId: String,
    val password: String,
    val phoneNumber: String,
    val birth: String,

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String? = null
) {
}