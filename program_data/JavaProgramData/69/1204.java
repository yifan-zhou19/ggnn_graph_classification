package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[250];
		int[] b = new int[250];
		int[] c = new int[251];
		String d = new String(new char[251]);
		String e = new String(new char[251]);
		int i;
		int len1;
		int len2;
		int len;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			d = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			e = tempVar2.charAt(0);
		}
		for (i = 0;;i++)
		{
			if (d.charAt(i) == '\0')
			{
				break;
			}
		}
		len1 = i;
		for (i = 0;;i++)
		{
			if (e.charAt(i) == '\0')
			{
				break;
			}
		}
		len2 = i;
		for (i = 0;i < len1;i++)
		{
			a[i] = d.charAt(len1 - i - 1) - '0';
		}
		for (i = 0;i < len2;i++)
		{
			b[i] = e.charAt(len2 - i - 1) - '0';
		}
		if (len1 > len2)
		{
			len = len1;
		}
		else
		{
			len = len2;
		}
		for (i = 0;i < len;i++)
		{
			c[i] = a[i] + b[i];
		}
		for (i = 0;i < len;i++)
		{
			if (c[i] > 9)
			{
				c[i + 1] += c[i] / 10;
				c[i] %= 10;
			}
		}
			 for (i = len;i >= 0;i--)
			 {
				   if (c[i] != 0)
				   {
					 System.out.printf("%d",c[i]);
							   break;
				   }
				 if (i == 0)
				 {
					 System.out.print("0");
				 }
			 }

		for (i--;i >= 0;i--)
		{
			System.out.printf("%d",c[i]);
		}
		return 0;
	}

}

