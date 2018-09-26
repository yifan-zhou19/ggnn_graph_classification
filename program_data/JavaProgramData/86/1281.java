package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0)
		{
			n--;
			int time = 0;
			int num = 0;
			int count = 0;
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			if (t == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=&t;
				int p = t;
				int[] a = new int[p];
				for (i = 0;i < t;i++)
				{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				//cout<<"t="<<t<<' ';
				for (i = 0;i < t;i++)
				{
					if ((a[i] + 3 * (count + 1)) >= 60)
					{
						//cout<<"********"<<"a[i]="<<a[i]<<' ';
						if ((a[i] + 3 * count) >= 60)
						{
							num = a[i - 1] + 60 - time;
							break;
						}
						else
						{
							num = a[i];
							break;
						}
					}
					count++;
					time = a[i] + 3 * count;
					//cout<<"time="<<time<<' ';
					num = a[i];
					if (i == t - 1)
					{
						num += 60 - time;
					}
					//cout<<"i="<<i<<' '<<a[i]<<' ';
				}
				System.out.print(num);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

