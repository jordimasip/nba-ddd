package com.jordimasip.app.backoffice.controller.teams;

import com.jordimasip.app.backoffice.controller.RequestTestCase;
import org.junit.jupiter.api.Test;


public final class TeamsPutControllerTest extends RequestTestCase {

   @Test
   void create_a_valid_team() throws Exception {
       assertRequestWithBody(
           "PUT",
           "/teams/5c018dd8-9855-4a08-9d7f-ccb6363a8e55",
           "{\"name\": \"Cleveland Cavaliers\"}",
           201
       );
   }
}
