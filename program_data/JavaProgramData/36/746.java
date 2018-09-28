package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int[] num1 = new int[300];
		int[] num2 = new int[300];
		int len1;
		int len2;
		int i;
		int num;
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
		len1 = a.length();
		len2 = b.length();
		if (len1 != len2)
		{
			System.out.print("NO\n");
		}
		else
		{
			for (i = 0;i < 300;i++)
			{
				num1[i] = 0;
				num2[i] = 0;
			}
			num = 0;
			for (i = 0;i < len1;i++)
			{
				num1[a.charAt(i)]++;
				num2[b.charAt(i)]++;
			}
			for (i = 0;i < 300;i++)
			{
				if (num1[i] != num2[i])
				{
					System.out.print("NO\n");
					break;
				}
				else
				{
					num++;
				}
			}
			if (num == 300)
			{
				System.out.print("YES\n");
			}
		}
	}

}

