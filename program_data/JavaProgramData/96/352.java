package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		int lenth;
		int b;
		int c;
		int i;
		int[] a = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			a[i] = s.charAt(i) - '0';

		}
		lenth = i;
		for (i = 0;i < lenth;i++)
		{
		   b = a[i] / 13;
		   if (lenth == 1)
		   {
		   System.out.printf("%d",b);
		   }
		   else if (lenth == 2 && a[i] * 10 + a[i + 1] < 13)
		   {
		   System.out.printf("%d",b);
		   }
		   else if (!((b == 0) && ((i == 1) || (i == 0))))
		   {
		   System.out.printf("%d",b);
		   }
		   c = a[i] % 13;
		   a[i + 1] = a[i + 1] + 10 * c;


		}
		System.out.print("\n");
		System.out.printf("%d",c);
	}
}

