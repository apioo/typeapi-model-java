package org.typeapi.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Describes HTTP Basic authentication, requiring a base64-encoded username and password.")
public class SecurityHttpBasic extends Security {
}

