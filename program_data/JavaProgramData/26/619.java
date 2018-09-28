package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String aa = new String(new char[100]);
		aa = new Scanner(System.in).nextLine();
		int i;
		int j;
		i = 0;
		while (aa.charAt(i) != '\0')
		{
			j = 0;
		   if (aa.charAt(i) != ' ')
		   {
		   System.out.print(aa.charAt(i));
		   i++;
		   }
		   if (aa.charAt(i) == ' ')
		   {
		   System.out.print(" ");
			 while (aa.charAt(i + j) == ' ')
			 {
			  j++;
			 }
			  i = i + j;
		   }
		}
			  return 0;
	}
}
