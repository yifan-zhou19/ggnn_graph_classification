package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void pr(char * a,int n,char boy,char girl,int * k);
		char boy;
		char girl;
		String a = new String(new char[100]);
		int i;
		int b = 0;
		int g = 0;
		int[] k = new int[100];
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
			if (a.charAt(i) == a.charAt(0))
			{
				b++;
			}
			else
			{
				g++;
			}
			if (b == g)
			{
				break;
			}
		}
		boy = a.charAt(0);
		girl = a.charAt(b * 2 - 1);
		for (i = 0;i < 100;i++)
		{
			k[i] = i;
		}
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
	tangible.RefObject<Integer> tempRef_k = new tangible.RefObject<Integer>(k);
		pr(tempRef_a, 2 * b, boy, girl, tempRef_k);
		k = tempRef_k.argValue;
		a = tempRef_a.argValue;
	}

	public static void pr(tangible.RefObject<String> a, int n, char boy, char girl, tangible.RefObject<Integer> k)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			if (*(a.argValue.Substring(i)) == girl)
			{
				System.out.printf("%d %d\n",*(k.argValue + i - 1),*(k.argValue + i));
				i--;
				break;
			}
		}
		for (;i < n - 2;i++)
		{
			*(a.argValue.Substring(i)) = *(a.argValue.Substring(i) + 2);
			*(k.argValue + i) = *(k.argValue + i + 2);
		}
		if (n > 3)
		{
			pr(a, n - 2, boy, girl, k);
		}
	}

}

