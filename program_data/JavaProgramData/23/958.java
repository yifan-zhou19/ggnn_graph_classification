package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1000]);
		  int[] b = new int[1000];
		  int num = 0;
		  int i;
		  int j;
		  int k;
		  int check = 0;
		  b[0] = 0;
		  a = new Scanner(System.in).nextLine();
		  for (i = 0;a.charAt(i) != '\0';i++)
		  {
		  if (a.charAt(i) == ' ')
		  {
		  check++;
		  }
		  }
		  if (check == 0)
		  {
		  System.out.println(a);
		  }
		  else
		  {
		  for (j = 1;j <= check;j++)
		  {
		  for (i = b[j - 1] + 1;a.charAt(i) != '\0';)
		  {
		  if (a.charAt(i) == ' ')
		  {
			  b[j] = i;
		  break;
		  }
		  else
		  {
			  i++;
		  }
		  }

		  }

		 b[check + 1] = 1000;
		  for (j = check;j > 0;j--)
		  {
		  for (i = b[j] + 1;i < b[j + 1] && a.charAt(i) != '\0';i++)
		  {
		  System.out.printf("%c",a.charAt(i));
		  }
		  System.out.print(" ");
		  }
		  for (i = 0;a.charAt(i) != ' ';i++)
		  {
		  System.out.printf("%c",a.charAt(i));
		  }
		  }
		  System.in.read();
		  System.in.read();
	}
}
