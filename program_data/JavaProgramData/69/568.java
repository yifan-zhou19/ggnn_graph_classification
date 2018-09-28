package <missing>;

public class GlobalMembers
{
	public static void add()
	{
		String a = new String(new char[255]);
		String b = new String(new char[255]);
		int[] ua = new int[255];
		int[] ub = new int[255];
		int[] sum = new int[255];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int lena;
		int lenb;
		lena = a.length(),lenb = b.length();
		for (int i = 0;i < lena;i++)
		{
			ua[i] = a.charAt(lena - 1 - i) - 48;
		} //cout<<ua[i];}
	//	cout<<endl;
		for (int i = 0;i < lenb;i++)
		{
			ub[i] = b.charAt(lenb - 1 - i) - 48;
		} //cout<<ub[i];}
	//	cout<<endl;
		int max;
		if (lena > lenb)
		{
			max = lena;
		}
		else
		{
			max = lenb;
		}
		int temp;
		for (int i = 0;i < max + 1;i++)
		{
			temp = ua[i] + ub[i];
			ua[i + 1] += temp / 10;
			sum[i] = temp % 10;
	//		cout<<temp<<endl;
		}
		int mark = 0;
		for (int i = 254;i >= 0;i--)
		{
			if (sum[i] != 0)
			{
			mark = 1;
			}
			if (mark == 1)
			{
			System.out.print(sum[i]);
			}
		}
		if (mark == 0)
		{
			System.out.print("0");
		}
		System.out.print("\n");
	}

	public static int Main()
	{
	//	int n;
	//	cin>>n;
	//	for (int i=0;i<n;i++)
		add();
	}
}

