package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] c = new int[100];
		int b;
		int d = 0;
		int i = 0;
		int j;
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		b = str.length();
		if (b == 1)
		{
		System.out.printf("0\n%c",str[0]);
		}
		else
		{
		   a[0] = (str[0] - '0') * 10 + str[1] - '0';
		   if (a[0] < 13 && b == 2)
		   {
		   System.out.printf("%d",0);
		   }

		   c[0] = a[0] / 13;
		   d = a[0] % 13;
		   for (i = 1;i <= b - 2;i++)
		   {
			  a[i] = d * 10 + str[i + 1] - '0';
			  c[i] = a[i] / 13;
			  d = a[i] % 13;
		   }

		   if (c[0] != 0)
		   {
			 System.out.printf("%d",c[0]);
		   }
		   for (i = 1;i <= b - 2;i++)
		   {
			 System.out.printf("%d",c[i]);
		   }
		   System.out.print("\n");
		   System.out.printf("%d",d);

		}

	}
}

