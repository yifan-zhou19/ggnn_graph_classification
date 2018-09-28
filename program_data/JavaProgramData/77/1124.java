import java.util.*;

void f(int,char[],char,char);
int[] tag = new int[100];
int main()
{
	String a = new String(new char[100]);
	a = new Scanner(System.in).nextLine();
	int l;
	int p;
	l = a.length();
	char boy;
	char girl;
	boy = a.charAt(0);
	for (int i = 0;i < l;i++)
	{
		if (a.charAt(i) != boy)
		{
			girl = a.charAt(i);
			p = i;
			break;
		}
	}
	f(p,a,boy,girl);
	return 0;
}
void f(int p,char b[100],char m,char fe)
{
	if (b[p] == '\0')
	{
		return;
	}
	if (b[p] != fe)
	{
		f(p + 1,b,m,fe);
	}
	else
	{
		for (int i = p - 1;i >= 0;i--)
		{
			if (tag[i] == 0)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(p);
				System.out.print("\n");
				tag[i] = 1;
				tag[p] = 1;
				break;
			}
		}
		f(p + 1,b,m,fe);
	}
}
