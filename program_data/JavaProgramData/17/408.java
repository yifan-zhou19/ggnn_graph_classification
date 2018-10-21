import java.util.*;

int match = int;
int count = int;
int match = new int(int,int,int,int);
char[][] a = new char[50][105];
char[][] b =
{
	{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
};
int[] num = new int[50];
int main()
{
	for (int i = 0;;i++)
	{
		a[i] = new Scanner(System.in).nextLine();
		count(i);
		match(i);
		System.out.print(a[i]);
		System.out.print("\n");
		System.out.print(b[i]);
		System.out.print("\n");
	}
	return 0;
}
int count(int m)
{
	for (int i = 0;a[m][i] != 0;i++)
	{
		num[m]++;
	}
	return 0;
}
int cur = 0;
int flag = 0;

int match(int k)
{
	for (int i = 0;i < num[k];i++)
	{
		if (a[k][i] == '(')
		{
			b[k][i] = '$';
		}
		else if (a[k][i] == ')')
		{
			b[k][i] = '?';
		}
		else
		{
			b[k][i] = ' ';
		}
	}
	while (true)
	{
		int flag = -1;
		int judge = 0;
		for (int i = 0;i < num[k];i++)
		{
			if (b[k][i] == '$' && b[k][i + 1] == '?')
			{
			b[k][i] = ' ';
			b[k][i + 1] = ' ';
			judge = 1;
			break;
			}
		else if (b[k][i] == '$' && b[k][i + 1] == ' ')
		{
			flag = i;
		}
		else if (b[k][i] == '?' && flag >= 0)
		{
			b[k][i] = ' ';
			b[k][flag] = ' ';
			 flag = -1;
			 judge = 1;
			 break;
		}
		}
		if (judge == 0)
		{
			break;
		}
	}
	return 0;

}
