package race.domain

@JvmInline
value class CarName(val name: String) {
    init {
        if (name.length > NAME_MAX_LENGTH) {
            throw IllegalArgumentException("자동차 이름은 ${NAME_MAX_LENGTH}자를 초과할 수 없습니다")
        }
    }

    companion object {
        const val NAME_MAX_LENGTH = 5
    }
}
