package <missing>;

public class GlobalMembers
{
	public static int Comp(Object p1, Object p2)
	{
		return *((int)p1) > (int)p2 ? -1:1;
	}


	public static int Main()
	{
		int[] tian = new int[2000];
		int[] qi = new int[2000];
		int n;
		int count;
		int a_first;
		int a_end;
		int b_first;
		int b_end;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			for (int i = 0 ; i < n; i++)
			{
				tian[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0; i < n; i++)
			{
				qi[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			qsort(tian,n,(Integer.SIZE / Byte.SIZE),Comp);
			qsort(qi,n,(Integer.SIZE / Byte.SIZE),Comp);
			count = 0;
			a_first = 0;
			a_end = n - 1;
			b_first = 0;
			b_end = n - 1;
			while (a_first <= a_end)
			{
				//cout<<a_first<<" "<<a_end<<" "<<b_first<<" "<<b_end<<endl;
				//cout<<tian[a_first]<<" "<<qi[b_first]<<endl;
				if (tian[a_first] > qi[b_first])
				{
					count++;
					a_first++;
					b_first++;
				}
				else if (tian[a_end] > qi[b_end])
				{
					count++;
					a_end--;
					b_end--;
				}
				else if (tian[a_first] == qi[b_first])
				{
					if (tian[a_end] > qi[b_first])
					{
						count++;
						a_end--;
						b_first++;
					}
					else if (tian[a_end] == qi[b_first])
					{
						a_end--;
						b_first++;
					}
					else if (tian[a_end] < qi[b_first])
					{
						count--;
						a_end--;
						b_first++;
					}
				}
				else
				{
					if (tian[a_end] > qi[b_first])
					{
						count++;
						a_end--;
						b_first++;
					}
					else if (tian[a_end] == qi[b_first])
					{
						a_end--;
						b_first++;
					}
					else if (tian[a_end] < qi[b_first])
					{
						count--;
						a_end--;
						b_first++;
					}
				}
			}
			System.out.print(count * 200);
			System.out.print("\n");
		}
		return 0;
	}
}

