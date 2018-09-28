package <missing>;

public class GlobalMembers
{
	/*
	 * ??-???-1.cpp
	 *
	 *  Created on: 2011-3-29
	 *      Author: user
	 */
	public static int compare(Object element1, Object element2)
	{
		return ((int)element2) - ((int)element1);
	}
	public static int Main()
	{
		int n;
		int[] A = new int[1000];
		int[] B = new int[1000];
		int front1;
		int front2;
		int back1;
		int back2;
		int sum = 0;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				return 0;
			}
			for (int i = 0;i < n;i++)
			{
				A[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0;i < n;i++)
			{
				B[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			front1 = front2 = 0;
			back1 = back2 = n - 1;
			sum = 0;
			qsort(A,n,(Integer.SIZE / Byte.SIZE),compare);
			qsort(B,n,(Integer.SIZE / Byte.SIZE),compare);
			/*for(int i=0;i<n;i++)
				cout<<A[i]<<endl;*/
			while (front1 <= back1)
			{
				if (A[back1] > B[back2])
				{
					sum += 200;
					back1 -= 1;
					back2 -= 1;
				}
				else if (A[back1] == B[back2])
				{
					if (A[front1] < B[front2])
					{
						back1 -= 1;
						front2 += 1;
						sum -= 200;
					}
					else if (A[front1] == B[front2])
					{
						back1 -= 1;
						front2 += 1;
						if (B[front2 - 1] > A[back1 + 1])
						{
							sum -= 200;
						}
						else
						{
							sum += 0;
						}
					}
					else if (A[front1] > B[front2])
					{
						front1 += 1;
						front2 += 1;
						sum += 200;
					}
				}
				else if (A[back1] < B[back2])
				{
					sum -= 200;
					back1 -= 1;
					front2 += 1;
				}
				//cout<<sum<<endl;
				//cout<<front1<<" "<<back1<<" "<<front2<<" "<<back2<<endl;
			}
			System.out.print(sum);
			System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(A,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(B,0,(Integer.SIZE / Byte.SIZE));
		}
	}

}

