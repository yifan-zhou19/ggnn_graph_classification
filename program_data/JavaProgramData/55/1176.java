package <missing>;

public class GlobalMembers
{
	public static int Main() //5
	{
	 double m = 0;
	 double n = 0;
	 double sum = 0;
	 final String a = "0";
	 int[] b = new int[100];
	 final String c = "0"; //10
	 m = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	 a = tangible.StringFunctions.changeCharacter(a, 0, ConsoleInput.readToWhiteSpace(true));
	 for (int i = 1;i < 100;i++)
	 {
	  if ((a[i] = System.in.read()) == ' ')
	  {
		  break; //15
	  }
	 }
	 n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	 int longa = a.length();
	 for (int j = 0;j < (longa - 1);j++)
	 { //20
	  b[j] = a.charAt(j);
	  if (b[j] > 47 && b[j] < 58)
	  {
		  sum = sum + (b[j] - 48) * Math.pow(m,(longa - j - 2));
	  }
	  if (b[j] > 64 && b[j] < 91)
	  {
		  sum = sum + (b[j] - 55) * Math.pow(m,(longa - j - 2));
	  }
	  if (b[j] > 96 && b[j] < 123)
	  {
		  sum = sum + (b[j] - 87) * Math.pow(m,(longa - j - 2));
	  }
	 } //25
	 int z = 0;
	 int x = 0;
	 int sum2 = sum;
	 int n2 = n;
	 do
	 {
	  z = sum2 % n2;
	  sum2 = sum2 / n2; //30
	  if (z >= 0 && z < 10)
	  {
		  c = tangible.StringFunctions.changeCharacter(c, x, z + 48);
	  }
	  if (z >= 10 && z < 37)
	  {
		  c = tangible.StringFunctions.changeCharacter(c, x, z + 55);
	  }
	  x++;
	 } while (sum2 != 0); //35
	 int longc = c.length();
	 for (int y = 1;y <= longc;y++)
	 {
	  System.out.print(c.charAt(longc - y));
	 } //40
	 return 0;
	}
}

