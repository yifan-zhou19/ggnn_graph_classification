/*
 * ????????.cpp
 * ??????? s ? w ??? s ??? w ?????????
 * ????: 2010-11-19
 * ??: ??
 */



int main() {
	//??s,w
	char s[50], w[50];
	cin >> s >> w;

	//??s?w???
	int length = strlen(w);
	int length1 = strlen(s);

	//????s?w????????
	int i, j;
	for (i = 0; i < length; i++) {
		//??w[i]?s??????????????(length1-1)?
		if (w[i] == s[0]) {
			for (j = i + 1; j < i + length1; j++) {
				if (w[j] != s[j - i])
					break;
			}

			//??j??i+length1????w????s????i
			if (j == i + length1) {
				cout << i << endl;
				break;
			}
		}
	}

	return 0; //????
}
