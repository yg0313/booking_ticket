package yg.booking_ticket.entity

import jakarta.persistence.*

@Entity
@Table(name = "user_address")
class Address(
    val zipCode: String,
    val address: String,
    val extraAddress: String,
    val defaultAddress: Boolean,

    @ManyToOne
    val user: User,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
) {
}