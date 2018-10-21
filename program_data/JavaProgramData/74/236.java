package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int a;
		int flag;
		int k;
		int i;
		int j = 0;
		int x;
		int y;
		int[] num = new int[100];
		final String temp = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		p = temp;
		q = temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (a = m;a <= n;a++)
		{
			k = Math.sqrt(a);
			for (i = 2;i <= k;i++)
			{
				if (a % i == 0)
				{
					flag = 0;
					break;

				}
			}
			if (i > Math.sqrt(a))
			{
				flag = 1;

			}

		if (flag != 0)
		{
			i = 0;
			x = a % 10;
			y = a / 10;
			temp = tangible.StringFunctions.changeCharacter(temp, 99, x + '0');

			while (y >= 10)
			{

				x = y % 10;
				y = y / 10;
				temp = tangible.StringFunctions.changeCharacter(temp, 98 - i, x + '0');
				i++;
			}
			temp = tangible.StringFunctions.changeCharacter(temp, 98 - i, y + '0');
			p = temp;
			q = temp.Substring(99);
			for (;p < q;p++)
			{
				if (*p != '\0')
				{
					break;
				}
			}

			for (;p <= q;p++,q--)
			{
				if (*p != *q)
				{
					flag = 0;
					break;
				}
			}
		}
		if (flag != 0)
		{
			num[j] = a;
			j++;
		}
		}
		if (num[0] == 0)
		{
			System.out.print("no");
		}
		else
		{
			 j = 0;
			while (num[j + 1] != 0)
			{
				System.out.printf("%d,",num[j]);
				j++;
			}
			System.out.printf("%d",num[j]);
		}


	}



}

