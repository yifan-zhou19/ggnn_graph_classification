package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

		int a;
		int b;
		int i = 0;
		int k;
		int x = 0;
		int n = 0;
		int m = 0;
		String s = new String(new char[20]);
		int[] t = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}


		 while (s.charAt(i) != '\0')
		 {
			n++;
			i++;
		 }

		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) <= 57)
			{
				k = (int)s.charAt(i) - 48;
			}
			else if (s.charAt(i) <= 90)
			{
				k = (int)s.charAt(i) - 55;
			}
			else
			{
				k = (int)s.charAt(i) - 87;
			}
			x = x + k * (int)Math.pow(a,n - i - 1);
		}


		i = 0;

//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	;
				t[i] = x % b;
				x = x / b;
				i++;
				m++;
				if (x != 0)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}

		for (i = m - 1;i >= 0;i--)
		{
			if (t[i] <= 9)
			{
			System.out.printf("%d",t[i]);
			}
			else if (t[i] >= 10)
			{
				t[i] = t[i] + 55;
				System.out.printf("%c",t[i]);
			}
		}


	}


}

