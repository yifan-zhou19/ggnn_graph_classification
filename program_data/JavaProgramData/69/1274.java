package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		int[] s1 = new int[260];
		int[] s2 = new int[261];
		int[] r = new int[260];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,'0',260);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,'0',260);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s2,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(r,0,(Integer.SIZE / Byte.SIZE));
		//cout << r[258] << endl;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		//cout << a <<endl << b;

		int l1 = a.length();
		int l2 = b.length();

		int max;
		if (l1 > l2)
		{
			max = l1;
		}
		else
		{
			max = l2;
		}
		//?????
		int j = 0;
		for (int i = l1 - 1; i >= 0; i--,j++)
		{
			s1[j] = a.charAt(i) - '0';
			//cout << s1[j];
		}
		j = 0;
		for (int i = l2 - 1; i >= 0; i--,j++)
		{
			s2[j] = b.charAt(i) - '0';
			//cout << s2[j];
		}

		//??
		int x = 0;
		for (int i = 0; i < 260;i++)
		{
			r[i] = r[i] + s1[i] + s2[i];
			//x = i;
			if (r[i] > 9)
			{
				r[i] = r[i] - 10;
				r[i + 1]++;
				//x = i+1;
			}
			if (r[i] != 0)
			{
				x = i;
			}
		}

		//cout << x << endl;
		for (int i = x; i >= 0; i--)
		{
			System.out.print(r[i]);
		}

		return 0;
	}
}

