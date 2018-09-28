package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String aa = new String(new char[100]);
		int i;
		i = 0;
		 aa = new Scanner(System.in).nextLine();
		while (aa.charAt(i) != '\0')
		{
		  if (aa.charAt(i) <= 57 && aa.charAt(i) >= 48)
		  {
		  System.out.print(aa.charAt(i));
		  if (aa.charAt(i + 1) > 57 || aa.charAt(i + 1) < 48)
		  {
		  System.out.print("\n");
		  }
		  }
		  i++;
		}
		  return 0;
	}

}
