import java.util.*;

String queen = new String(new char[1000]);
// int main()
// {
// 	cin >> queen;
// 	int len = strlen(queen);
// 	char a, b;
// 	int cnt = 0;
// 	int boy[1000] = {0};
// 	a = queen[0];
// 	b = queen[len - 1];
// 	for (int i = 0; i < len; i++)
// 	{
// 		if (queen[i] == a)
// 		{
// 			boy[cnt] = i;
// 			cnt ++;
// 		}
// 		if (queen[i] == b)
// 		{
// 			cnt --;
// 			cout << boy[cnt] << ' ' << i << endl;
// 		}
// 	}
// 	while(EOF!=getchar());
// 	return 0;
// }
	char a;
	char b;
	int cnt = 0;
	int len;
int match = char * ;
int main()
{
	queen = new Scanner(System.in).nextLine();
	len = queen.length();

	a = queen.charAt(0);
	b = queen.charAt(len - 1);
	String p = queen;
	match(p);
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
	while (EOF != System.in.read())
	{
		;
	}
	return 0;
}

int match(char * p)
{
	int q;
	if (*p == b)
	{
		return p - queen;
	}
	else
	{
		q = match(p + 1);
		System.out.print(p - queen);
		System.out.print(' ');
		System.out.print(q);
		System.out.print("\n");
		cnt++;
		if (cnt < len / 2)
		{
					return match(q + queen.Substring(1));
		}

	}

}
