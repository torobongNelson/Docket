package com.praisebassey.docket.Controllers;

import com.praisebassey.docket.Models.SupportBuddy;
import com.praisebassey.docket.Models.Task;
import com.praisebassey.docket.Services.SupportBuddyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/buddy")
public class SupportBuddyController {
    private final SupportBuddyService supportBuddyService;

    public SupportBuddyController(SupportBuddyService supportBuddyService) {
        this.supportBuddyService = supportBuddyService;
    }


    @GetMapping("/buddies")
    public ResponseEntity<List<SupportBuddy>> viewBuddies(){
        List<SupportBuddy> buddies = supportBuddyService.viewSupportBuddies();
        return new ResponseEntity<>(buddies, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupportBuddy> viewBuddy(@PathVariable("id") String id){
        SupportBuddy buddy = supportBuddyService.viewSupportBuddy(id);
        return new ResponseEntity<>(buddy,HttpStatus.OK);
    }


    @PostMapping("/create")
    public ResponseEntity<SupportBuddy> createBuddy(@RequestBody SupportBuddy buddy){
        SupportBuddy createdBuddy = supportBuddyService.createSupportBuddy(buddy);
        return new ResponseEntity<>(createdBuddy,HttpStatus.CREATED);
    }


    @PutMapping("/update")
    public ResponseEntity<SupportBuddy> updateBuddy(@RequestBody SupportBuddy buddy){
        SupportBuddy updatedBuddy = supportBuddyService.updateSupportBuddy(buddy);
        return new ResponseEntity<>(updatedBuddy,HttpStatus.CREATED);
    }

    @DeleteMapping ("/delete/{buddyId}")
    public ResponseEntity<?> deleteBuddy(@PathVariable("buddyId") String buddyId){
        supportBuddyService.deleteSupportBuddy(buddyId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
