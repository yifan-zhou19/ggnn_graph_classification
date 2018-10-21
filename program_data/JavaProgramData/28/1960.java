package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1000]);
		  a = new Scanner(System.in).nextLine();
		  int i = 0;
		  int time = 0;
		  int temp = 0;
		  int len = a.length();
		  for (i = 0;i < len;i++)
		  {
							if (a.charAt(i) != ' ')
							{
									temp++;
							}
							else
							{
								if (temp != 0)
								{
										   if (time == 0)
										   {
											   System.out.printf("%d",temp);
										   }
										   else
										   {
											   System.out.printf(",%d",temp);
										   }
										   time++;
										   temp = 0;
								}
							}
		  }
		  if (time == 0)
		  {
			  System.out.printf("%d",temp);
		  }
		  else
		  {
			  System.out.printf(",%d",temp);
		  }
	}
}
