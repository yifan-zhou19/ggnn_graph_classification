package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[100][100];
		String input = new String(new char[101]);
		int i;
		int j;
		int m = 0;
		int k = 0;
		int t = 1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * in;
		(char)(*p)[100];
		in = input;
		for (i = 0; (*(in++) = System.in.read()) != '\n'; i++)
		{
			m++;
		}
		*(in - 1) = '\0';
		//puts (input); printf ("%d\n", m);
		in = input;
		p = str;
		//printf("%s",in);
		for (i = 0; * (in + i) != '\0'; i++)
		{
			if (*(in + i) == ' ')
			{
				t++;
			}
		}
		//printf ("%d\n", t);
		in = input;
		for (i = 0; i < t; i++)
		{
			for (j = 0; * in != '\0' && *(in++) != ' '; j++)
			{
				*(*(p + i) + j) = *(in - 1);
			}
			*(*(p + i) + j) = '\0';
			//printf("%s\n",p[i]);
			k++;
		}
		p = str;
		for (i = k - 1; i >= 0; i--)
		{
			if (i == 0)
			{
			System.out.printf("%s", *(p + i));
			}
			else
			{
				System.out.printf("%s ", *(p + i));
			}
		}
		return 0;
	}
}
