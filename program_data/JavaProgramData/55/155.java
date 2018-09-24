package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a1;
		int a2;
		int i;
		int len;
		int j;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long t=0,n[40],k;
		int t = 0;
		int[] n = new int[40];
		int k;
		String num1 = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a2 = Integer.parseInt(tempVar3);
		}
		len = num1.length();
		for (i = len - 1,j = 0;i >= 0;i--,j++)
		{
			if (num1.charAt(i) >= 'A' && num1.charAt(i) <= 'Z')
			{
				n[i] = 10 + num1.charAt(i) - 'A';
			}
			if (num1.charAt(i) >= 'a' && num1.charAt(i) <= 'z')
			{
				n[i] = 10 + num1.charAt(i) - 'a';
			}
			if (num1.charAt(i) >= '0' && num1.charAt(i) <= '9')
			{
				n[i] = 1 + num1.charAt(i) - '1';
			}
			t = t + n[i] * (int)Math.pow(a1,j);
		}
		for (i = 0;;i++)
		{
			k = t / (int)Math.pow(a2,i);
			if (k < a2) // !
			{
			break;
			}
		}
		  for (;i >= 0;i--)
		  {
			n[i] = t / (int)Math.pow(a2,i);
			t = t - (int)Math.pow(a2,i) * n[i];
				if (n[i] >= 0 && n[i] <= 9)
				{
					System.out.printf("%c",n[i] + 48);
				}
				if (n[i] >= 10 && n[i] <= 35)
				{
					System.out.printf("%c",n[i] + 55);
				}
		  }
	}

}

