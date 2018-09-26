package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String moto = new String(new char[510]);
		String a = new String(new char[7]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			moto = tempVar2.charAt(0);
		}
		int len;
		len = moto.length();
		int i;
		int j;


//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		a = (char[7])malloc(sizeof(char[7]) * (len - n + 1));
		int[] t = new int[500];
		for (i = 0; i < 500; i++)
		{
			t[i] = 1;
		}


		for (i = 0; i + n <= len; i++)
		{
			for (j = 0; j < n; j++)
			{
				*(*(a.Substring(i)) + j) = *(moto.Substring(i) + j);
			}
			*(*(a.Substring(i)) + n) = '\0';
		}

		len = len - n + 1;
		int max = 1;
		char[] zero = {'0', '\0', '\0', '\0', '\0', '\0', '\0'};
		for (i = 1; i < len; i++)
		{
			for (j = 0; j < i; j++)
			{
				if (strcmp(*(a.Substring(j)), *(a.Substring(i))) == 0)
				{
					t[j] += 1;
					*(a.Substring(i)) = zero;
					break;
				}
			}
		}

		for (j = 0; j < len; j++)
		{
			if (t[j] > max)
			{
				max = t[j];
			}
		}
		if (max > 1)
		{
			System.out.printf("%d\n", max);
			for (i = 0; i < len; i++)
			{
				if (t[i] == max)
				{
					System.out.printf("%s\n", *(a.Substring(i)));
				}
			}
		}
		else
		{
			System.out.print("NO");
		}
	}
}

