package com.fms.feedbackmanagementsystem4.serviceinterface;

import com.fms.feedbackmanagementsystem4.dto.TicketInDto;
import com.fms.feedbackmanagementsystem4.dto.TicketOutDto;
import com.fms.feedbackmanagementsystem4.dto.TicketOutDtoWithComments;
import com.fms.feedbackmanagementsystem4.dto.UpdateTicketInDto;

import java.util.List;

/**
 * Ticket service Interface.
 */
public interface TicketServiceInterface {
  /**
   * Get ticket By Id.
   *
   * @param id Integer
   * @return TicketOutDtoWithComments
   */
  TicketOutDtoWithComments ticketById(Integer id);

  /**
   * Update Ticket.
   *
   * @param id Integer
   * @param ticketDto TicketDto
   * @return TicketOutDto
   */
  TicketOutDtoWithComments updateTicket(
      Integer id, UpdateTicketInDto ticketDto);

  /**
   * Find all Ticket.
   *
   * @param id Integer
   * @param type String
   * @param filter String
   * @param offset Integer
   * @return List of TicketOutDto
   */
  List<TicketOutDto> findAll(
       Integer id, String type, String filter, Integer offset);

  /**
   * Add Ticket.
   *
   * @param ticketInDto type TicketDto.
   *
   * @return TicketOutDto.
   */
  TicketOutDto addTicket(TicketInDto ticketInDto);
}
