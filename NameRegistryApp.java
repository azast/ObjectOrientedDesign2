public class NameRegistryApp
{
  public static void main (String[] args)
  {
    try (UserInterface ui = new UserInterface ())
    {
      NameRegister nameRegister = new NameRegister ();
      run (nameRegister, ui);
    }
    catch (Exception e)
    {
      System.out.println ("got exception [ " + e + " ], exiting...");
      System.exit (1);
    }
  }

  // application logic - DO NOT CHANGE!
  private static void run (NameRegister nameRegister, UserInterface ui)
  {
    String[] names = ui.readNames (); // read names from user
    nameRegister.setNames (names); // store names into register
    ui.showNames (nameRegister.getNames ()); // show names in register to user
  }
}
