package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String b = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int i;
		int[] bb = new int[300];
		int[] aa = new int[300];
		int len;
		int lena;
		int lenb;
		int start;


		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		lena = a.length();
		lenb = b.length();

		len = lena > lenb != 0?lena:lenb;

			for (p = a,i = lena - 1;p < a.Substring(lena);p++,i--)
			{
				aa[i] = p - '0';
			}

				for (p = b,i = lenb - 1;p < b.Substring(lenb);p++,i--)
				{
				bb[i] = p - '0';
				}


		for (i = 0;i < len;i++)
		{
			bb[i] = aa[i] + bb[i];

		}

		for (i = 0;i <= len;i++)
		{
			if (bb[i] >= 10)
			{
				bb[i] -= 10;
				bb[i + 1]++;
			}
		}

		start = 0;

		for (i = len;i >= 0;i--)
		{

			if (start != 0)
			{
				System.out.printf("%d",bb[i]);
			}
			else if (bb[i] != 0)
			{
				System.out.printf("%d",bb[i]);
				start = 1;
			}
		}
		if (start == 0)
		{
			System.out.print("0");
		}

	}


}
