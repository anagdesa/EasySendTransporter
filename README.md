# Easy Send Transporter
App EasySend Transporter for android
By Anagdesa aka wega


2. Three of component to make Screen Home 
    --- java ---
    Intro Activity --> This is main of Screen Home
    Intro ViewPAgerAdapter --> This to configuration slider of image menu on EasySend Transporter Truck 
                           (The truck has 6 models : 2x2feet, 4x4feet, 2x2feet chiller, 4x4feet chiller, and the last menu etc of truck)
    Intro View PAgerIklan --> This activity for iklan
    ScreenIklan & ScreenItem --> To getting and setting configuration from xml to java

    --- xml ---



condition if you want to change same click on your button

example -->
-------------------------------------------------------------------------------------------------
 //activasi tombol daftar ke form pendaftaran

        tombole = (Button)findViewById(R.id.daftar);
    tombole.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(LoginActivity.this, RegistrasiActivity.class);
            startActivity(i); }
            });
-------------------------------------------------------------------------------------------------
