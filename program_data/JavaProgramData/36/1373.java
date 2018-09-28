package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int length1;
		int length2;
		int i;
		int j;
		int t = 0;
		length1 = a.length();
		length2 = b.length();
		if (length1 != length2)
		{
			System.out.print("NO\n");
		}
		else
		{
			int[] aa = new int[10000];
			int[] bb = new int[10000];
			for (i = 0;i < length1;i++)
			{
				   aa[i] = 1;
				   bb[i] = 1;
			}
			for (i = 0;i < length1;i++)
			{
				   for (j = 0;j < length1;j++)
				   {
						  if (a.charAt(i) == b.charAt(j) && bb[j] == 1)
						  {
												   bb[j] = 0;
												   break;
						  }
				   }
			}
			for (j = 0;j < length1;j++)
			{
				  if (bb[j] == 0)
				  {
					  t++;
				  }
			}
			if (t == length1)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}

		System.in.read();
		System.in.read();
		System.in.read();
	}


}

