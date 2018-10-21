package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[5];
		int i;
		char[] n = {'l', 'q', 'z', 's', '\0'};
		for (i = 0;i < 5;i++)
		{
		a[i] = (i + 1) * 10;
		}
		System.out.printf("%c %d\n",n[0],a[4]);
		 System.out.printf("%c %d\n",n[1],a[3]);
		System.out.printf("%c %d\n",n[2],a[1]);
		 System.out.printf("%c %d\n",n[3],a[0]);
		System.in.read();
		System.in.read();

	}

}
