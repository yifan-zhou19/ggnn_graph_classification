package <missing>;

public class GlobalMembers
{
	public static int reverse(int num) //?????
	{
		int[] a = new int[10];
		int i;
		int j;
		int m;
		int count = 0;
		int newnum = 0;
		if (num >= 0)
		{ //????????0?
		   for (i = 0; ;i++)
		   {
					 m = Math.pow(10.0,i);
			   a[i] = num / m % 10;
			   if (m > num)
			   {
				   count = i;
				   break;
			   } //???????
		   }

			  for (j = 0;a[j] != 0;j++)
			  {
			m = Math.pow(10.0,count - j - 1);
			newnum = a[j] * m;
			break;
			  }
			for (i = j + 1;i < count;i++)
			{
				m = Math.pow(10.0,count - 1 - i);
				newnum = newnum + a[i] * m;
			}
			return (newnum); //???????
		}
		if (num < 0)
		{ //?????????????????????
		   num = -num;
		   for (i = 0; ;i++)
		   {
			  m = Math.pow(10.0,i);
			  a[i] = num / m % 10;
			  if (m > num)
			  {
				  count = i;
				  break;
			  }
		   }

			  for (j = 0;a[j] != 0;j++)
			  {
			m = Math.pow(10.0,count - j - 1);
			newnum = a[j] * m;
			break;
			  }
			for (i = j + 1;i < count;i++)
			{
				m = Math.pow(10.0,count - 1 - i);
				newnum = newnum + a[i] * m;
			}
			return (-newnum);
		}

	}

	public static int Main() //?????
	{
		int num;
		int i;
		for (i = 0;i < 6;i++)
		{
		   num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   System.out.print(reverse(num));
		   System.out.print("\n");
		}
		return 0;
	}

}

