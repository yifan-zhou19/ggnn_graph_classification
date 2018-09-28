package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		int i;
		int s = 0;
		a = new Scanner(System.in).nextLine();
		int x = 0;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
							 b[i] = a.charAt(i) - '0';
							 s = 10 * s + b[i];
							 b[i] = s / 13;
							 s = s - 13 * b[i];
							 if (b[i] != 0)
							 {
										System.out.printf("%d",b[i]);
										x = 1;
							 }
							 else
							 {
								 if (x == 1)
								 {
								 System.out.printf("%d",b[i]);
								 }
							 }
		}
		if (x == 0)
		{
		System.out.print("0");
		}
	   System.out.printf("\n%d",s);


	}


}
