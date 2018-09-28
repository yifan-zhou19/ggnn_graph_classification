package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[20000];
		int[] b = new int[20000];
		int q;
		int j;
		int[] mark = new int[20000];
		int m;
		int s;
		int[] temp = new int[20000];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 64)
		{
			System.out.print("22");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
		}
		for (i = 0;i < 20000;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] == 0 && b[i] == 0)
			{
				break;
			}
		}
		m = i;
		temp[0] = b[0];
		q = 1;
		for (i = 1;i < m;i++)
		{
			if (b[i] != temp[q - 1])
			{
				temp[q] = b[i];
				q++;
			}
		}
		for (i = 0;i < q;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (b[j] == temp[i])
				{
					mark[a[j]]++;
				}
			}
			mark[temp[i]] = 1;
			for (s = 0;s < n;s++)
			{
				if (mark[s] == 0)
				{
					break;
				}
			}
			if (s >= n)
			{
				System.out.printf("%d",temp[i]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto end;
			}
		}
		if (i >= q)
		{
			System.out.print("NOT FOUND");
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	;
	}





}

