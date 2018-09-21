package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[1201]);
		int[] a = new int[300];
		int i;
		int j = 0;
		int c;
		int k;
		int max;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 0;s.charAt(i) != '\0';i = i + 1)
		{
			switch (s.charAt(i))
			{
			case'0':
			a[j] = a[j] * 10 + 0;
			break;
			case'1':
			a[j] = a[j] * 10 + 1;
			break;
			case'2':
			a[j] = a[j] * 10 + 2;
			break;
			case'3':
			a[j] = a[j] * 10 + 3;
			break;
			case'4':
			a[j] = a[j] * 10 + 4;
			break;
			case'5':
			a[j] = a[j] * 10 + 5;
			break;
			case'6':
			a[j] = a[j] * 10 + 6;
			break;
			case'7':
			a[j] = a[j] * 10 + 7;
			break;
			case'8':
			a[j] = a[j] * 10 + 8;
			break;
			case'9':
			a[j] = a[j] * 10 + 9;
			break;
			case',':
			j = j + 1;
			break;
			default:
				break;
			}
		}
		for (i = 0;i <= j;i = i + 1)
		{
			c = 0;
			max = 0;
			for (k = 0;k <= j;k = k + 1)
			{
				if (a[i] < a[k])
				{
					if (a[k] != max)
					{
						max = a[k];
						c = c + 1;
						if (c == 2)
						{
							break;
						}
					}
				}
			}
			if (c == 1)
			{
				System.out.printf("%d\n",a[i]);
				d = 1;
				break;
			}
		}
		if (d == 0)
		{
			System.out.print("No\n");
		}
	}


}

