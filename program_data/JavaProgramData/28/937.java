package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String s = new String(new char[30000]);
		int wc;
		int[] a = new int[100];
		int i;
		int j;
		wc = 0;
		 s = new Scanner(System.in).nextLine();
		 for (i = 0;s.charAt(i) != 0;i++)
		 {
							 if (s.charAt(i) != ' ')
							 {
							 for (j = i + 1;s.charAt(j) != 0 && s.charAt(j) != ' ';j++)
							 {
								 ;
							 }
							 a[wc] = j - i;
							 wc++;
							if (s[j] = 0)
							{
									   break;
							}
									   else
									   {
												i = j;
									   }
							 }
		 }
		 System.out.printf("%d",a[0]);
		 for (i = 1;i < wc;i++)
		 {
						  System.out.printf(",%d",a[i]);
		 }

	  return 0;
	}

}
