package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[1000]);
		int[] a = new int[1000];
		int i;
		int yu;
		int len;
		int sh;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}
		len = n.length();
		for (i = 0;i < len;i++)
		{
		   a[i] = n.charAt(i) - 48;
		}
		if (len == 1)
		{
			System.out.printf("0\n%s",n);
		}
		if (len == 2 && (10 * a[0] + a[1]) < 13)
		{
			System.out.printf("0\n%s",n);
		}
		if (len > 2 || (len == 2 && (10 * a[0] + a[1]) >= 13))
		{
			 if ((10 * a[0] + a[1]) >= 13)
			 {
				 yu = (10 * a[0] + a[1]) % 13;
				 sh = (10 * a[0] + a[1]) / 13;
				 System.out.printf("%d",sh);
			 }
			 if ((10 * a[0] + a[1]) < 13)
			 {
				 yu = 10 * a[0] + a[1];
			 }
			 for (i = 2;i < len;i++)
			 {

				 sh = (10 * yu + a[i]) / 13;
				 yu = (10 * yu + a[i]) % 13;
				 System.out.printf("%d",sh);
			 }
			 System.out.print("\n");
			 System.out.printf("%d",yu);
		}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		i = Integer.parseInt(tempVar2);
	}
	return 0;

	}
}

