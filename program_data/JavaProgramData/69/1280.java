package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String c = new String(new char[252]);
		for (int i = 0;i < 252;i++)
		{
		c = c.substring(0, i);
		}
		int[] x = new int[251];
		int[] y = new int[251];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int la = a.length();
		int lb = b.length();
		if (la == 1 && lb == 1 && a.charAt(0) == '0' && b.charAt(0) == '0')
		{
		  System.out.print("0\n");
		  return 0;
		}
		int len = la > lb != 0?la:lb;
	   // printf("%d %d %d\n",la,lb,len);
		int i = 0;
		int j = 0;
		int m = 0;
		for (i = la - 1;i >= 0;i--)
		{
		x[j++] = a.charAt(i) - '0';
		}
		j = 0;
		for (i = lb - 1;i >= 0;i--)
		{
		y[j++] = b.charAt(i) - '0';
		}
		if (len > la)
		{
		for (i = la;i < len;i++)
		{
		x[i] = 0;
		}
		}
		if (len > lb)
		{
		for (i = lb;i < len;i++)
		{
		y[i] = 0;
		}
		}
		j = 0;
		for (i = 0;i < len;i++)
		{
		   if (c.charAt(j) + x[i] + y[i] < 10)
		   {
			  c.charAt(j) += x[i] + y[i] + '0';
			  j++;
		   }
		   else
		   {
			   c.charAt(j) += (x[i] + y[i] - 10) + '0';
			   c = tangible.StringFunctions.changeCharacter(c, j + 1, 1);
			   j++;
		   }
		}
		if (c.charAt(len) == 1)
		{
		c = tangible.StringFunctions.changeCharacter(c, len, 1 + '0');
		}
		for (i = len;i >= 0;i--)
		{
		if (c.charAt(i) != '0' && c.charAt(i) != 0)
		{
			break;
		}
		}
		for (;i >= 0;i--)
		{
		System.out.printf("%c",c.charAt(i));
		}
		System.out.print("\n");
		//printf("%s\n%s\n",a,b);
		return 0;
	}

}

