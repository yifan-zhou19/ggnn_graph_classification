package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[1000]);
	s = new Scanner(System.in).nextLine();
	System.in.read();
	int i;
	int[] a = new int[300];
	int k = 0;
	for (i = 0;i < s.length();i++)
	{
							 if (s.charAt(i) != ' ')
							 {
						   a[k]++;
							 }
						   if (s.charAt(i) == ' ')
						   {
										 k++;

						   }
	}
	 i = 1;
	 System.out.printf("%d",a[0]);
	 System.in.read();
	 while (i <= k)
	 {
				 if (a[i] == 0)
				 {
					i++;
				 }
				 else
				 {
					System.out.printf(",%d",a[i]);
					System.in.read();
					i++;
				 }

	 }
		return 0;
	}
}
