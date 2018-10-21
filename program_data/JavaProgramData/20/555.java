package <missing>;

public class GlobalMembers
{
		public static void Main()
		{
			char[][] str =
			{
				{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
			};
			char[][] substr =
			{
				{0, '\0', '\0', '\0'}
			};
			char[][] a =
			{
				{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
			};
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p;
			String q;
			String i;
			int n;
			int t = 1;
			int max;
			int x;
			while (scanf("%s %s",str[t],substr[t]) != EOF)
			{
				t++;
			}
			for (n = 1;n <= t;n++)
			{
				p = str[n];
				max = str[n][0];
				for (; * p != 0;p++)
				{
					if (*p > max)
					{
					max = p;
					q = p;
					}
				}
					p = str[n];
					for (x = 0;p <= q;x++)
					{
						a[n][x] = p++;
					}
					a[n][x] = substr[n][0];
					a[n][x + 1] = substr[n][1];
					a[n][x + 2] = substr[n][2];
					 i = a[n] + x + 3;
					 i = p;
					 System.out.printf("%s\n",a[n]);
			}
		}





}
