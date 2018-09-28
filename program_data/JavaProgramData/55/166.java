package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int l;
		int m = 1;
		int num = 0;
		String n = new String(new char[32]);
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = n.length();
		for (i = 0;i < l;i++)
		{
			if ((n.charAt(i) >= 'a') && (n.charAt(i) <= 'z'))
			{
				n.charAt(i) -= 87;
			}
			if ((n.charAt(i) >= 'A') && (n.charAt(i) <= 'Z'))
			{
				n.charAt(i) -= 55;
			}
			if ((n.charAt(i) >= '0') && (n.charAt(i) <= '9'))
			{
				n.charAt(i) -= 48;
			}
		}
		for (i = l - 1;i >= 0;i--)
		{
			//if(m==1){num+=n[i];m=m*a;}
			num += m * n.charAt(i);
			m = m * a;
		}
		m = 1;
		for (i = 31;i >= 0;i--)
		{
			str[i] = num % b;
			num = num / b;
			if (num == 0)
			{
				break;
			}
		}
		for (l = i;l < 32;l++)
		{
			if ((str[l] >= 0) && (str[l] <= 9))
			{
				System.out.printf("%d",str[l]);
			}
			if (str[l] >= 10)
			{
				System.out.printf("%c",str[l] + 55);
			}
		}
		System.out.print("\n");
	}

}

