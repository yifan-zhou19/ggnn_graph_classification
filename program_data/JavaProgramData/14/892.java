public class ace
{
	public String id = new String(new char[10]);
	public int a;
	public int b;
}

package <missing>;

public class GlobalMembers
{
	public static ace[] o = tangible.Arrays.initializeWithDefaultaceInstances(3);
	public static ace r = new ace();


	public static void Main()
	{
		int n;
		int i;
		int[] s = new int[3];
		int m;
		int j;
		int v;
		String z = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			o[0].id = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			o[0].a = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			o[0].b = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			o[1].id = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			o[1].a = Integer.parseInt(tempVar6);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			o[1].b = Integer.parseInt(tempVar7);
		}
		String tempVar8 = ConsoleInput.scanfRead();
		if (tempVar8 != null)
		{
			o[2].id = tempVar8.charAt(0);
		}
		String tempVar9 = ConsoleInput.scanfRead(" ");
		if (tempVar9 != null)
		{
			o[2].a = Integer.parseInt(tempVar9);
		}
		String tempVar10 = ConsoleInput.scanfRead(" ");
		if (tempVar10 != null)
		{
			o[2].b = Integer.parseInt(tempVar10);
		}
		s[0] = o[0].a + o[0].b;
		s[1] = o[1].a + o[1].b;
		s[2] = o[2].a + o[2].b;
		for (i = 0;i < 2;i++)
		{
			for (j = i + 1;j < 3;j++)
			{
				if (s[i] < s[j])
				{
					z = o[i].id;
					o[i].id = o[j].id;
					o[j].id = z;
					v = s[i];
					s[i] = s[j];
					s[j] = v;
				}
			}
		}
		for (i = 0;i < n - 3;i++)
		{
			String tempVar11 = ConsoleInput.scanfRead();
			if (tempVar11 != null)
			{
				r.id = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				r.a = Integer.parseInt(tempVar12);
			}
			String tempVar13 = ConsoleInput.scanfRead(" ");
			if (tempVar13 != null)
			{
				r.b = Integer.parseInt(tempVar13);
			}
			m = r.a + r.b;
			if (m > s[0])
			{
				o[2] = o[1];
				s[2] = s[1];
				o[1] = o[0];
				s[1] = s[0];
				o[0] = r;
				s[0] = m;
			}
			else if (m <= s[0] != 0 && m> s[1])
			{
				o[2] = o[1];
				s[2] = s[1];
				o[1] = r;
				s[1] = m;
			}
			else if (m <= s[1] != 0 && m> s[2])
			{
				o[2] = r;
				s[2] = m;
			}
		}
		System.out.printf("%s %d\n",o[0].id,s[0]);
		System.out.printf("%s %d\n",o[1].id,s[1]);
		System.out.printf("%s %d\n",o[2].id,s[2]);







	}

}

