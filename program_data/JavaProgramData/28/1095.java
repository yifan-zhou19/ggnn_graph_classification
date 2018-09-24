package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int l;
		int x;
		int y;
		String z = new String(new char[1000]);
		z = new Scanner(System.in).nextLine();

		x = z.length();
		for (i = 0;i < x;i++)
		{
					 if (z.charAt(i) == ' ')
					 {
								j = 0;
					 }
					 else
					 {
						 j++;
					 }
					 if (z.charAt(i + 1) == ' ' || z.charAt(i + 1) == '\0')
					 {
								  System.out.printf("%d",j);
								  y = 1;
					 }
					 if (y == 1)
					 {
							 break;
					 }
		}
		for (l = i + 1;l < x;l++)
		{
					 if (z.charAt(l) == ' ')
					 {
								j = 0;
					 }
					 else
					 {
						 j++;
					 }
					 if (z.charAt(l + 1) == ' ' || z.charAt(l + 1) == '\0')
					 {
								  if (j != 0)
								  {
									  System.out.printf(",%d",j);
								  }
					 }

		}



		  return 0;
	}

}
