package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int la;
		int lb;
		int length;
		int i;
		int s;
		int j;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int[] aArray = new int[100];
		int[] bArray = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (s = 1;s <= n;s++)
		{
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

			la = a.length();
			lb = b.length();
			length = la - lb;

			for (i = 0;i < la;i++)
			{
				aArray[i] = a.charAt(i) - '0';
			}
			for (i = 0;i < length;i++)
			{

				bArray[i] = 0;
			}

			for (i = length;i < la;i++)
			{
				bArray[i] = b.charAt(i - length) - '0';
			}

			for (i = la - 1;i >= 0;i--)
			{
				if (aArray[i] >= bArray[i])
				{
					a = tangible.StringFunctions.changeCharacter(a, i, aArray[i] - bArray[i]);
				}
				if (aArray[i] < bArray[i])
				{
					a = tangible.StringFunctions.changeCharacter(a, i, aArray[i] + 10 - bArray[i]);
					aArray[i - 1]--;
				}


			}

			for (i = 0;i < la;i++)
			{
				 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 48);
			}

			for (i = 0;i < la;i++)
			{
				if (a.charAt(i) != 0)
				{
				 for (j = i;j < la;j++)
				 {
				System.out.printf("%c",a.charAt(j));
				 }
				}
				System.out.print("\n");
				break;
			}
		}
	}

}

