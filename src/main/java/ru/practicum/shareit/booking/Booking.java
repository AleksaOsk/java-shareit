package ru.practicum.shareit.booking;


import lombok.Data;
import ru.practicum.shareit.item.model.Item;
import ru.practicum.shareit.user.model.User;

import java.time.LocalDate;

@Data
public class Booking {
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    private Item item;
    private User booker;
    private Status status;
}