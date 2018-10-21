package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String c = new String(new char[500]);
	int[] a = new int[27];
	int i;
	int j;
	int k;
	int m;
	for (i = 1;(c[i] = System.in.read()) != '\n';i++)
	{
	switch (c.charAt(i))
	{
	case'a':
	a[1]++;
	break;
	case'b':
	a[2]++;
	break;
	case'c':
	a[3]++;
	break;
	case'd':
	a[4]++;
	break;
	case'e':
	a[5]++;
	break;
	case'f':
	a[6]++;
	break;
	case'g':
	a[7]++;
	break;
	case'h':
	a[8]++;
	break;
	case'i':
	a[9]++;
	break;
	case'j':
	a[10]++;
	break;
	case'k':
	a[11]++;
	break;
	case'l':
	a[12]++;
	break;
	case'm':
	a[13]++;
	break;
	case'n':
	a[14]++;
	break;
	case'o':
	a[15]++;
	break;
	case'p':
	a[16]++;
	break;
	case'q':
	a[17]++;
	break;
	case'r':
	a[18]++;
	break;
	case's':
	a[19]++;
	break;
	case't':
	a[20]++;
	break;
	case'u':
	a[21]++;
	break;
	case'v':
	a[22]++;
	break;
	case'w':
	a[23]++;
	break;
	case'x':
	a[24]++;
	break;
	case'y':
	a[25]++;
	break;
	case'z':
	a[26]++;
	break;
	}
	}
	k = 0;
	for (i = 1;i <= 26;i++)
	{
	k = k + a[i];
	}
	if (k == 0)
	{
	System.out.print("No");
	}
	else
	{
	for (j = 1;j <= 26;j++)
	{
	if (a[j] != 0)
	{
	System.out.printf("%c=%d\n",j + 96,a[j]);
	}
	}
	}
	}

}
