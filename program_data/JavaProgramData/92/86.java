package <missing>;

public class GlobalMembers
{
	public static int MyCmp(Object e1, Object e2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p1=(int *)e1;
		int p1 = (int)e1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p2 = (int *)e2;
		int p2 = (int)e2;
		return (p2) - p1;
	}
	public static int Main()
	{
		int n;
		int i;
		int sum;
		int front2;
		int back2;
		int front;
		int back;
		int[] a = new int[1010];
		int[] b = new int[1010];
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			sum = 0;
			for (i = 0;i < n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(a,n,(Integer.SIZE / Byte.SIZE),MyCmp);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),MyCmp);
			front2 = front = 0;
			back2 = back = n - 1;
			while (front2 <= back2)
			{
				if (a[front] > b[front2])
				{
					front++;
					front2++;
					sum += 200;
				}
				else if (a[front] == b[front2])
				{
					while (front <= back)
					{
						if (a[back] > b[back2])
						{
							sum += 200;
							back--;
							back2--;
						}
						else
						{
							if (a[back] < b[front2])
							{
								sum -= 200;
							}
							back--;
							front2++;
							break;
						}
					}
				}
				else
				{
					//if(a[back]<b[counter])
						sum -= 200;
					back--;
					front2++;
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

