package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[270];
		int[] b = new int[270];
		int i;
		int wp;
		int wq;
		String s1 = new String(new char[270]);
		String s2 = new String(new char[270]);
		for (i = 0 ; i < 251 ; i++)
		{
			a[i] = -1;
			b[i] = -1;
		}
		int[] p = a; //p??a????q??b???
		int[] q = b;
		s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		i = 0;
		while (s1.charAt(i) != '\0')
		{
			p[0]++= s1.charAt(i++) - '0'; //?????????
		}
		wp = i; //a[]??????
		i = 0;
		while (s2.charAt(i) != '\0')
		{
			q[0]++= s2.charAt(i++) - '0';
		}
		wq = i;
		p--; //?p??a[]??????
		q--; //q??
		int jinwei = 0; //??????????????????????????
		while (p >= a && q >= b) //a,b?????????
		{
			int temp;
			temp = p[0] + q[0] + jinwei; //?????????????????????????
			p[0] = temp % 10; //?????????10
			q[0] = p[0];
			jinwei = temp / 10; //jinwei??????10
			p--; //?????
			q--;
		}
		if (wp >= wq) //a????b
		{
			while (p >= a) //???b????a
			{
				if (jinwei == 0) //????????????????
				{
					break;
				}
				int temp; //????????
				temp = p[0] + jinwei;
				p[0] = temp % 10;
				jinwei = temp / 10;
				p--;
			}
			if (jinwei != 0)
			{
				System.out.print("1");
				for (i = 0 ; a[i] != -1 ; i++)
				{
					System.out.print(a[i]);
				}
			}
			else
			{
				for (i = 0 ; a[i] == 0 ; i++)
				{
					; //???????0???
				}
				if (a[i] == -1) //??0??????0
				{
					System.out.print("0");
				}
				else
				{
					for (; a[i] != -1 ; i++)
					{
						System.out.print(a[i]);
					}
				}
			}
		}
		else //b????a??
		{
			while (q >= b)
			{
				if (jinwei == 0)
				{
					break;
				}
				int temp;
				temp = q[0] + jinwei;
				q[0] = temp % 10;
				jinwei = temp / 10;
				q--;
			}
			if (jinwei != 0)
			{
				System.out.print("1");
				for (i = 0 ; b[i] != -1 ; i++)
				{
					System.out.print(b[i]);
				}
			}
			else
			{
				for (i = 0 ; b[i] == 0 ; i++)
				{
					;
				}
				if (b[i] == -1)
				{
					System.out.print("0");
				}
				else
				{
					for (; b[i] != -1 ; i++)
					{
						System.out.print(b[i]);
					}
				}
			}
		}
		return 0;
	}
}

