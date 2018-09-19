package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t = 0;
		int c = 1;
		int d = 1;
		int n;
		int p = 0;
		int q = 0;
		int r = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
		int b;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct pp
	//	{
	//		int x;
	//		int y;
	//		int z;
	//	}
	//	*s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (pp)malloc((Integer.SIZE / Byte.SIZE) * 3 * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].y = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i].z = tempVar4;
			}
			b[i] = ((s[i].y) + (s[i].z));
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] > t)
			{
				t = b[i];
				p = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			{
				if ((b[i] > c) && (i != p))
				{
					c = b[i];
				q = i;
				}
		}
		}
		for (i = 0;i < n;i++)
		{
			{
				if ((b[i] > d) && (i != p) && (i != q))
				{
					d = b[i];
				r = i;
				}
		}
		}
		System.out.printf("%d %d\n",s[p].x,b[p]);
		System.out.printf("%d %d\n",s[q].x,b[q]);
		System.out.printf("%d %d\n",s[r].x,b[r]);
		return 0;
	}


}

