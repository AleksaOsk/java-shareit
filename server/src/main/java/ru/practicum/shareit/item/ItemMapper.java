package ru.practicum.shareit.item;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import ru.practicum.shareit.item.dto.ItemReqDto;
import ru.practicum.shareit.item.dto.ItemResponseDto;
import ru.practicum.shareit.item.dto.ItemUpdateRequestDto;
import ru.practicum.shareit.item.dto.ItemWithCommentsResponseDto;
import ru.practicum.shareit.item.model.Item;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ItemMapper {
    public static Item mapToItem(ItemReqDto request) {
        Item item = new Item();
        item.setName(request.getName());
        item.setDescription(request.getDescription());
        item.setIsAvailable(request.getAvailable());
        return item;
    }

    public static ItemResponseDto mapToItemDto(Item item) {
        ItemResponseDto itemDto = new ItemResponseDto();
        itemDto.setId(item.getId());
        itemDto.setName(item.getName());
        itemDto.setDescription(item.getDescription());
        itemDto.setAvailable(item.getIsAvailable());
        itemDto.setRequest(item.getRequest());

        return itemDto;
    }

    public static ItemWithCommentsResponseDto mapToItemWithCommentsDto(Item item) {
        ItemWithCommentsResponseDto itemDto = new ItemWithCommentsResponseDto();
        itemDto.setId(item.getId());
        itemDto.setName(item.getName());
        itemDto.setDescription(item.getDescription());
        itemDto.setAvailable(item.getIsAvailable());
        itemDto.setRequest(item.getRequest());

        return itemDto;
    }

    public static Item updateMapToItem(Item item, ItemUpdateRequestDto itemUpdateRequestDto) {
        if (itemUpdateRequestDto.getName() != null && !itemUpdateRequestDto.getName().isBlank()) {
            item.setName(itemUpdateRequestDto.getName());
        }
        if (itemUpdateRequestDto.getDescription() != null && !itemUpdateRequestDto.getDescription().isBlank()) {
            item.setDescription(itemUpdateRequestDto.getDescription());
        }
        if (itemUpdateRequestDto.getAvailable() != null) {
            item.setIsAvailable(itemUpdateRequestDto.getAvailable());
        }

        return item;
    }
}
