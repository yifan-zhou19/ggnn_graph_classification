package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int j;
		int n = 0;
		int sum = 0;
		int t = 0;
		float k;
		float c;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		if (a.length() != b.length())
		{
			System.out.print("error");
			t = 1;
		}

		if (t == 0)
		{
		   for (i = 0;a.charAt(i) != '\0';i++)
		   {
			   if (t == 0)
			   {
				if (a.charAt(i) != 65 && a.charAt(i) != 71 && a.charAt(i) != 67 && a.charAt(i) != 84)
				{
					System.out.print("error");
					t = 1;
				}
			   }
		   }
		}

		if (t == 0)
		{
					for (j = 0;b.charAt(j) != '\0';j++)
					{
						if (t == 0)
						{
						if (b.charAt(j) != 65 && b.charAt(j) != 71 && b.charAt(j) != 67 && b.charAt(j) != 84)
						{
							System.out.print("error");
							t = 1;
						}
						}
					}
		}

		if (t == 0)
		{
						  for (l = 0;a.charAt(l) != '\0';l++)
						  {
							 sum++;
							 if (a.charAt(l) == b.charAt(l))
							 {
							  n++;
							 }
						  }
						  c = (float)n / sum;
						  if (c > k)
						  {
							  System.out.print("yes");
						  }
						  else
						  {
							  System.out.print("no");
						  }
		}
		return 0;
	}





}

